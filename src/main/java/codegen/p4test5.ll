@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 5, i32* @a, align 4
  %0 = load i32, i32* @a, align 4
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond0
for.cond0:
  %1 = load i32, i32* %i, align 4
  %cmp0 = icmp slt i32 %1, %0
  br i1 %cmp0, label %for.body0, label %for.end0
for.body0:
  %2 = load i32, i32* %i, align 4
  %j = alloca i32, align 4
  store i32 %0, i32* %j, align 4
  br label %for.cond1
for.cond1:
  %3 = load i32, i32* %j, align 4
  %cmp1 = icmp slt i32 %3, 10
  br i1 %cmp1, label %for.body1, label %for.end1
for.body1:
  %4 = load i32, i32* %j, align 4
  %5 = load i32, i32* %j, align 4
  %6 = load i32, i32* %i, align 4
  %op0 = add nsw i32 %5, %6
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %op0)
  br label %for.inc1
for.inc1:
  %7 = load i32, i32* %j, align 4
  %inc1 = add nsw i32 %7, 1
  store i32 %inc1, i32* %j, align 4
  br label %for.cond1
for.end1:
  br label %for.inc0
for.inc0:
  %8 = load i32, i32* %i, align 4
  %inc0 = add nsw i32 %8, 1
  store i32 %inc0, i32* %i, align 4
  br label %for.cond0
for.end0:
  ret i32 0
}
declare i32 @printf(i8*, ...)
