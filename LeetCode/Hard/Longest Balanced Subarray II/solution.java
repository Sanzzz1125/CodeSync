class Solution {
    class SegTree {
        int n;
        int[] mint, maxt, lazy;

        public SegTree(int n) {
            this.n = n;
            mint = new int[4 * n];
            maxt = new int[4 * n];
            lazy = new int[4 * n];
        }

        public void push(int node, int st, int end) {
            if (lazy[node] != 0) {
                mint[node] += lazy[node];
                maxt[node] += lazy[node];
                if (st != end) {
                    lazy[2 * node + 1] += lazy[node];
                    lazy[2 * node + 2] += lazy[node];
                }
                lazy[node] = 0;
            }
        }

        public void updateRange(int node, int l, int r, int ql, int qr, int val) {
            push(node, l, r);
            if (l > qr || r < ql) return;
            if (l >= ql && r <= qr) {
                lazy[node] += val;
                push(node, l, r);
                return;
            }
            int mid = (l + r) / 2;
            updateRange(2 * node + 1, l, mid, ql, qr, val);
            updateRange(2 * node + 2, mid + 1, r, ql, qr, val);
            mint[node] = Math.min(mint[2 * node + 1], mint[2 * node + 2]);
            maxt[node] = Math.max(maxt[2 * node + 1], maxt[2 * node + 2]);
        }

        public int leftmostz(int node, int l, int r) {
            push(node, l, r);
            if (mint[node] > 0 || maxt[node] < 0) return -1;
            if (l == r) {
                return mint[node] == 0 ? l : -1;
            }
            int mid = (l + r) / 2;
            int left = leftmostz(2 * node + 1, l, mid);
            if (left != -1) return left;
            return leftmostz(2 * node + 2, mid + 1, r);
        }
    }

    public int longestBalanced(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;
        SegTree seg = new SegTree(n);
        int maxl = 0;
        HashMap<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int val = ((nums[i] & 1) == 0) ? 1 : -1;
            if (seen.containsKey(nums[i])) {
                seg.updateRange(0, 0, n - 1, 0, seen.get(nums[i]), -val);
            }
            seg.updateRange(0, 0, n - 1, 0, i, val);
            seen.put(nums[i], i);
            int zidx = seg.leftmostz(0, 0, n - 1);
            if (zidx != -1 && zidx <= i) {
                maxl = Math.max(maxl, i - zidx + 1);
            }
        }
        return maxl;
    }
}
