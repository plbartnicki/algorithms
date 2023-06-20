# 2 3 1
# r = 2
# b = 3
#
# asercja r < b
#
# porownujemy kolejny element i z r oraz b
# Mozliwosci
# i < r < b => pomijamy i bo nie moze byc drugim najwiekszym
# r < i < b => aktualizacja r = i
# r < b < i => aktualizacja r = b b = i

def second_largest(T):
    if(len(T) == 0 or len(T) == 1):
        return None

    r = T[0]
    b = T[1]
    # assertion r < b

    if(r > b):
        t = r
        r = b
        b = t

    i = 2
    while(i < len(T)):
        if(T[i] > r and T[i] < b):
            r = T[i]
        elif(T[i] > b):
            r = b
            b = T[i]

        ##  => T[i] < r, wiec pomijamy ten element:

        i += 1

    return r

def main():
    print(second_largest([1,2,3]))
    print(second_largest([3,2,1]))

    print(second_largest([4,5,2,1]))
    print(second_largest([4,5,2,4]))
    print(second_largest([10,5,9,1, 10, 8, 11, 10]))
    print(second_largest([10, 9, 10, 11]))
    print(second_largest([9, 10, 11, 10]))

main()
