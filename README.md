Please move to [my blog](https://github.com/everbrez/everbrez.github.io).

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
# Xbonacci
```
//Xbonacci Sequence
function Xbonacci(signature,n){
  const X = signature.length;
  let result = signature.slice(0,n);
  while(result.length < n){
  	result.push(result.slice(-X).reduce((a,b) => a+b));
  }
  return result;
}
```
# 分解因数
```
function decomposition(n){
	const result = {};
	for(let i = 2; i <= n; i++){
		if(n%i === 0){
			if(result[i]){
				result[i]++
			}else{
				result[i] = 1;
			}
			n /= i;
			i--;
		}
	}
	return result;
}
```
# toBase
```
function toBase(num,target){
	let base = target.length;
	if(num < base){return "" + target[num];}
	return toBase(Math.floor(num/base),target) + target[num % base];
}
```
# add two number in String
```
function add (a, b) {
  var res = '', c = 0
  a = a.split('')
  b = b.split('')
  while (a.length || b.length || c) {
    c += ~~a.pop() + ~~b.pop()
    res = c % 10 + res
    c = c > 9
  }
  return res
}
```
