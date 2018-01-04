# 判断是否奇数
```
function isOdd(num){
  return num % 2;
}
```
# 判断是否整数
```Number.isInteger()```

```num % 1 === 0```
# 只使用数组内容一次
```array.shift()```
```array.pop()```
# 将字符串反转
```
str.split("").reverse().join("");
```
# Maximum subarray sum
```
//maxSequence([-2, 1, -3, 4, -1, 2, 1, -5, 4])
// should be 6: [4, -1, 2, 1]
var maxSequence = function(arr){
  let result = 0;
  arr.reduce((sum,num)=>{
  	sum += num;
  	result = Math.max(result,sum);
  	return Math.max(sum,0);
  },0)
  return result;
}
```
