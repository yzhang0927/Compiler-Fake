@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@arr = common global [10 x i32] zeroinitializer, align 16
@len = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 10, i32* @len, align 4
  %arrayidx0 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 1
  store i32 123, i32* %arrayidx0, align 4
  %arrayidx1 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 2
  store i32 23, i32* %arrayidx1, align 4
  %arrayidx2 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 3
  store i32 1234, i32* %arrayidx2, align 4
  %arrayidx3 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 4
  store i32 1, i32* %arrayidx3, align 4
  %arrayidx4 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 5
  store i32 21, i32* %arrayidx4, align 4
  %arrayidx5 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 6
  store i32 11, i32* %arrayidx5, align 4
  %arrayidx6 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 7
  store i32 213, i32* %arrayidx6, align 4
  %arrayidx7 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 8
  store i32 22, i32* %arrayidx7, align 4
  %arrayidx8 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 9
  store i32 121, i32* %arrayidx8, align 4
  %0 = load i32, i32* @len, align 4
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond0
for.cond0:
  %1 = load i32, i32* %i, align 4
  %forcmp0 = icmp slt i32 %1, %0
  br i1 %forcmp0, label %for.body0, label %for.end0
for.body0:
  %2 = load i32, i32* %i, align 4
  %3 = load i32, i32* %i, align 4
  %op0 = sub nsw i32 %0, %3
  %j = alloca i32, align 4
  store i32 1, i32* %j, align 4
  br label %for.cond1
for.cond1:
  %4 = load i32, i32* %j, align 4
  %forcmp1 = icmp slt i32 %4, %op0
  br i1 %forcmp1, label %for.body1, label %for.end1
for.body1:
  %5 = load i32, i32* %j, align 4
  %6 = load i32, i32* %j, align 4
  %idxprom9 = sext i32 %6 to i64
  %arrayidx9 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 %idxprom9
  %7 = load i32, i32* %arrayidx9
  %op1 = add nsw i32 %6, 1
  %idxprom10 = sext i32 %op1 to i64
  %arrayidx10 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 %idxprom10
  %8 = load i32, i32* %arrayidx10
  %ifcmp0 = icmp sgt i32 %7, %8
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %idxprom11 = sext i32 %6 to i64
  %arrayidx11 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 %idxprom11
  %op2 = add nsw i32 %6, 1
  %idxprom12 = sext i32 %op2 to i64
  %arrayidx12 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 %idxprom12
  %tmp13 = alloca i32, align 4
  %9 = load i32, i32* %arrayidx11
  store i32 %9, i32* %tmp13, align 4
  %10 = load i32, i32* %arrayidx12
  store i32 %10, i32* %arrayidx11, align 4
  %11 = load i32, i32* %tmp13
  store i32 %11, i32* %arrayidx12, align 4
  br label %if.end0
if.else0: 
  br label %if.end0
if.end0:
  br label %for.inc1
for.inc1:
  %12 = load i32, i32* %j, align 4
  %inc1 = add nsw i32 %12, 1
  store i32 %inc1, i32* %j, align 4
  br label %for.cond1
for.end1:
  br label %for.inc0
for.inc0:
  %13 = load i32, i32* %i, align 4
  %inc0 = add nsw i32 %13, 1
  store i32 %inc0, i32* %i, align 4
  br label %for.cond0
for.end0:
  %k = alloca i32, align 4
  store i32 1, i32* %k, align 4
  br label %for.cond2
for.cond2:
  %14 = load i32, i32* %k, align 4
  %forcmp2 = icmp slt i32 %14, 10
  br i1 %forcmp2, label %for.body2, label %for.end2
for.body2:
  %15 = load i32, i32* %k, align 4
  %16 = load i32, i32* %k, align 4
  %idxprom14 = sext i32 %16 to i64
  %arrayidx14 = getelementptr inbounds [10 x i32], [10 x i32]* @arr, i64 0, i64 %idxprom14
  %17 = load i32, i32* %arrayidx14
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %17)
  br label %for.inc2
for.inc2:
  %18 = load i32, i32* %k, align 4
  %inc2 = add nsw i32 %18, 1
  store i32 %inc2, i32* %k, align 4
  br label %for.cond2
for.end2:
  ret i32 0
}
declare i32 @printf(i8*, ...)
