# 사용자로부터 다음과 같은 숫자들의 입력을 받아 입력받은 숫자들의 총합을 구하는 프로그램을 작성하시오. 
# (단, 숫자들은 콤마로 구분하여 입력한다. ex, 65,45,2,3,45,8 )

# 입력받은 숫자들
nums = input();

# ,를 기준으로 split
arr = nums.split(",");

# 합을 저장할 변수
sum = 0

# 각 배열의 값을 sum
for i in arr:
	sum = sum + int(i)

# 총합
print(sum)