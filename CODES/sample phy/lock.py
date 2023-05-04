def check(num):
    num = list(num)
    valid = False
    if '6' == num[0] and '6' != num[1] and '6' != num[2]:
        valid = True
    if '8' != num[0] and '8' == num[1] and '8' != num[2]:
        valid = True
    if '2' != num[0] and '2' != num[1] and '2' == num[2]:
        valid = True
    if not valid:
        pass # first condition not satisfied
    

for num in range(0, 1000):
    num = str(num)
    if len(num) == 1:
        num = '00' + num
    if len(num) == 2:
        num = '0' + num
    if check(num):
        print(num)