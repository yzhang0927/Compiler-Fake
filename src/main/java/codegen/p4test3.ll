@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = common global [10 x i32] zeroinitializer, align 16

define i32 @main() #0 {
entry:
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond0
for.cond0:
  %0 = load i32, i32* %i, align 4
  %forcmp0 = icmp slt i32 %0, 10
  br i1 %forcmp0, label %for.body0, label %for.end0
for.body0:
  %1 = load i32, i32* %i, align 4
  %2 = load i32, i32* %i, align 4
  %call0 = call i32 @fib(i32 %2)
  %idxprom0 = sext i32 %0 to i64
  %arrayidx0 = getelementptr inbounds [10 x i32], [10 x i32]* @a, i64 0, i64 %idxprom0
  store i32 %call0, i32* %arrayidx0, align 4
  br label %for.inc0
for.inc0:
  %3 = load i32, i32* %i, align 4
  %inc0 = add nsw i32 %3, 1
  store i32 %inc0, i32* %i, align 4
  br label %for.cond0
for.end0:
  %j = alloca i32, align 4
  store i32 1, i32* %j, align 4
  br label %for.cond1
for.cond1:
  %4 = load i32, i32* %j, align 4
  %forcmp1 = icmp slt i32 %4, 10
  br i1 %forcmp1, label %for.body1, label %for.end1
for.body1:
  %5 = load i32, i32* %j, align 4
  %6 = load i32, i32* %j, align 4
  %idxprom7 = sext i32 %6 to i64
  %arrayidx7 = getelementptr inbounds [10 x i32], [10 x i32]* @a, i64 0, i64 %idxprom7
  %7 = load i32, i32* %arrayidx7
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %7)
  br label %for.inc1
for.inc1:
  %8 = load i32, i32* %j, align 4
  %inc1 = add nsw i32 %8, 1
  store i32 %inc1, i32* %j, align 4
  br label %for.cond1
for.end1:
  ret i32 0
}
declare i32 @printf(i8*, ...)

define i32 @fib(i32 %x) {
entry:
  %x.addr = alloca i32, align 4
  store i32 %x, i32* %x.addr, align 4
  %0 = load i32, i32* %x.addr, align 4
  %ifcmp0 = icmp sgt i32 %0, 1
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %op0 = sub nsw i32 %0, 1
  %call0 = call i32 @fib(i32 %op0)
  %op1 = add nsw i32 %call0, %0
  ret i32 %op1
if.else0: 
  %1 = load i32, i32* %x.addr, align 4
  ret i32 %1
if.end0:
  ret i32 0
}
