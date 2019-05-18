@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@arr = common global [8 x i32] zeroinitializer, align 16
@len = global i32 0, align 4
@t = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 9, i32* @len, align 4
  store i32 0, i32* @t, align 4
  %p = alloca i32, align 4
  store i32 1, i32* %p, align 4
  br label %for.cond0
for.cond0:
  %0 = load i32, i32* %p, align 4
  %forcmp0 = icmp slt i32 %0, 8
  br i1 %forcmp0, label %for.body0, label %for.end0
for.body0:
  %1 = load i32, i32* %p, align 4
  %2 = load i32, i32* %p, align 4
  %op0 = sub nsw i32 10, %2
  %idxprom0 = sext i32 %0 to i64
  %arrayidx0 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom0
  store i32 %op0, i32* %arrayidx0, align 4
  br label %for.inc0
for.inc0:
  %3 = load i32, i32* %p, align 4
  %inc0 = add nsw i32 %3, 1
  store i32 %inc0, i32* %p, align 4
  br label %for.cond0
for.end0:
  %k = alloca i32, align 4
  store i32 1, i32* %k, align 4
  br label %for.cond1
for.cond1:
  %4 = load i32, i32* %k, align 4
  %forcmp1 = icmp slt i32 %4, 8
  br i1 %forcmp1, label %for.body1, label %for.end1
for.body1:
  %5 = load i32, i32* %k, align 4
  %6 = load i32, i32* %k, align 4
  %idxprom1 = sext i32 %6 to i64
  %arrayidx1 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom1
  %7 = load i32, i32* %arrayidx1
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %7)
  br label %for.inc1
for.inc1:
  %8 = load i32, i32* %k, align 4
  %inc1 = add nsw i32 %8, 1
  store i32 %inc1, i32* %k, align 4
  br label %for.cond1
for.end1:
  %9 = load i32, i32* @len, align 4
  %op1 = sub nsw i32 %9, 1
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond2
for.cond2:
  %10 = load i32, i32* %i, align 4
  %forcmp2 = icmp slt i32 %10, %op1
  br i1 %forcmp2, label %for.body2, label %for.end2
for.body2:
  %11 = load i32, i32* %i, align 4
  %12 = load i32, i32* %i, align 4
  %op2 = sub nsw i32 %9, %12
  %op3 = sub nsw i32 %op2, 1
  %j = alloca i32, align 4
  store i32 1, i32* %j, align 4
  br label %for.cond3
for.cond3:
  %13 = load i32, i32* %j, align 4
  %forcmp3 = icmp slt i32 %13, %op3
  br i1 %forcmp3, label %for.body3, label %for.end3
for.body3:
  %14 = load i32, i32* %j, align 4
  %15 = load i32, i32* %j, align 4
  %idxprom2 = sext i32 %15 to i64
  %arrayidx2 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom2
  %16 = load i32, i32* %arrayidx2
  %op4 = add nsw i32 %15, 1
  %idxprom3 = sext i32 %op4 to i64
  %arrayidx3 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom3
  %17 = load i32, i32* %arrayidx3
  %ifcmp0 = icmp sgt i32 %16, %17
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %tmp0 = alloca i32, align 4
  %idxprom4 = sext i32 %15 to i64
  %arrayidx4 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom4
  %op5 = add nsw i32 %15, 1
  %idxprom5 = sext i32 %op5 to i64
  %arrayidx5 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom5
  %18 = load i32, i32* %arrayidx5
  store i32 %18, i32* %tmp0, align 4
  %19 = load i32, i32* %arrayidx4
  store i32 %19, i32* %arrayidx5, align 4
  %20 = load i32, i32* %tmp0
  store i32 %20, i32* %arrayidx4, align 4
  br label %if.end0
if.else0: 
  br label %if.end0
if.end0:
  br label %for.inc3
for.inc3:
  %21 = load i32, i32* %j, align 4
  %inc3 = add nsw i32 %21, 1
  store i32 %inc3, i32* %j, align 4
  br label %for.cond3
for.end3:
  br label %for.inc2
for.inc2:
  %22 = load i32, i32* %i, align 4
  %inc2 = add nsw i32 %22, 1
  store i32 %inc2, i32* %i, align 4
  br label %for.cond2
for.end2:
  %kk = alloca i32, align 4
  store i32 1, i32* %kk, align 4
  br label %for.cond4
for.cond4:
  %23 = load i32, i32* %kk, align 4
  %forcmp4 = icmp slt i32 %23, 8
  br i1 %forcmp4, label %for.body4, label %for.end4
for.body4:
  %24 = load i32, i32* %kk, align 4
  %25 = load i32, i32* %kk, align 4
  %idxprom6 = sext i32 %25 to i64
  %arrayidx6 = getelementptr inbounds [8 x i32], [8 x i32]* @arr, i64 0, i64 %idxprom6
  %26 = load i32, i32* %arrayidx6
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %26)
  br label %for.inc4
for.inc4:
  %27 = load i32, i32* %kk, align 4
  %inc4 = add nsw i32 %27, 1
  store i32 %inc4, i32* %kk, align 4
  br label %for.cond4
for.end4:
  ret i32 0
}
declare i32 @printf(i8*, ...)
