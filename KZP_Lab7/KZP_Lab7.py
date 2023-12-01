def main():
    nRows = int(input("Enter size of matrix: "))
    arr = []
    filler = input("Enter symbol for filling: ")

    with open("MyFile.txt", "w") as fout:
        half = nRows // 2

        if nRows % 2 == 0:
            arr = [[' ' for _ in range(i2)] for i2 in range(2, nRows + 1, 2)]
        else:
            arr = [[' ' for _ in range(i2)] for i2 in range(1, nRows + 1, 2)]

        for i in range(half):
            print("\n")
            fout.write("\n")

        if nRows % 2 == 0:
            gap = half - 1
            symb = 2
        else:
            gap = half
            symb = 1

        for a in range(half):
            j = 0
            b = 0

            while j < gap:
                print(" ", end='')
                fout.write(" ")
                j += 1

            while b < symb and b < nRows:
                if len(filler) == 1:
                    arr[a][b] = filler
                    print(arr[a][b], end='')
                    fout.write(arr[a][b])
                    b += 1
                elif len(filler) == 0:
                    print("\nSymbol for filling is not found")
                    break
                else:
                    print("\nToo many symbols for filling")
                    break

            print("\n")
            fout.write("\n")
            gap -= 1
            symb += 2

        print("\n")
        fout.write("\n")


if __name__ == "__main__":
    main()
		
