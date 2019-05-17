@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@arr = common global [8 x i32] zeroinitializer, align 16
@len = global i32 0, align 4
@t = global i32 0, align 4
@leno = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 9, i32* @len, align 4
  store i32 3, i32* @leno, align 4
  store i32 0, i32* @t, align 4
  %kk = alloca i32, align 4
  store i32 1, i32* %kk, align 4
  br label %for.cond0
for.cond0:
  %0 = load i32, i32* %kk, align 4
  %forcmp0 = icmp slt i32 %0, 8
  br i1 %forcmp0, label %for.body0, label %for.end0
for.body0:
  %1 = load i32, i32* %kk, align 4
  %2 = load i32, i32* %kk, align 4
  %op0 = sdiv i32 %2, 2
  %op1 = sub nsw i32 9, %op0
  %idxprom0 = sext i32 %0 to i64
  %arrayidx0 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom0
  store i32 %op1, i32* %arrayidx0, align 4
  br label %for.inc0
for.inc0:
  %3 = load i32, i32* %kk, align 4
  %inc0 = add nsw i32 %3, 1
  store i32 %inc0, i32* %kk, align 4
  br label %for.cond0
for.end0:
  %4 = load i32, i32* @leno, align 4
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %4)
  %5 = load i32, i32* @len, align 4
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %5)
  %6 = load i32, i32* @len, align 4
  %op2 = sub nsw i32 %6, 1
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond1
for.cond1:
  %7 = load i32, i32* %i, align 4
  %forcmp1 = icmp slt i32 %7, %op2
  br i1 %forcmp1, label %for.body1, label %for.end1
for.body1:
  %8 = load i32, i32* %i, align 4
  %9 = load i32, i32* %i, align 4
  %op3 = sub nsw i32 %6, %9
  %op4 = sub nsw i32 %op3, 1
  %j = alloca i32, align 4
  store i32 1, i32* %j, align 4
  br label %for.cond2
for.cond2:
  %10 = load i32, i32* %j, align 4
  %forcmp2 = icmp slt i32 %10, %op4
  br i1 %forcmp2, label %for.body2, label %for.end2
for.body2:
  %11 = load i32, i32* %j, align 4
  %12 = load i32, i32* %j, align 4
  %idxprom13 = sext i32 %12 to i64
  %arrayidx13 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom13
  %13 = load i32, i32* %arrayidx13
  %op5 = add nsw i32 %12, 1
  %idxprom14 = sext i32 %op5 to i64
  %arrayidx14 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom14
  %14 = load i32, i32* %arrayidx14
  %ifcmp0 = icmp sgt i32 %13, %14
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  br label %if.end0
if.else0: 
  br label %if.end0
if.end0:
  br label %for.inc2
for.inc2:
  %15 = load i32, i32* %j, align 4
  %inc2 = add nsw i32 %15, 1
  store i32 %inc2, i32* %j, align 4
  br label %for.cond2
for.end2:
  br label %for.inc1
for.inc1:
  %16 = load i32, i32* %i, align 4
  %inc1 = add nsw i32 %16, 1
  store i32 %inc1, i32* %i, align 4
  br label %for.cond1
for.end1:
  ret i32 0
}
declare i32 @printf(i8*, ...)
