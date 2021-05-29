# k8s-java-sample
The source code contains two sample REST services:
- Adder
- Multiplier

## Adder
Accepts requests for adding two number like this:
http://kmaster:30080/add?op1=100&op2=345

## Multiplier
Accepts requests for multiplying two number like this:
http://kmaster:30080/multiply?op1=100&op2=345

## Releases
### Release 1
The output of adder and multiplier services looks like this:
{
    "op1":100,
    "op2":345,
    "answer":445,
    "operation":"add",
    "responder":"172.16.169.139"
}