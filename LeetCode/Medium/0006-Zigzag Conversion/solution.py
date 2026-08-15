class Solution:
    def convert(self, s: str, numRows: int) -> str:
        if numRows == 1 or numRows >= len(s):
            return s

        rows = ["" for _ in range(numRows)]
        currRow = 0
        goingDown = False

        for c in s:
            rows[currRow] += c

            if currRow == 0 or currRow == numRows - 1:
                goingDown = not goingDown

            currRow += 1 if goingDown else -1

        return "".join(rows)