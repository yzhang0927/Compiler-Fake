@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 5, i32* @a, align 4
  %0 = load i32, i32* @a, align 4
  %op0 = add nsw i32 %0, 4
  %i = alloca i32, align 4
  store i32 1, i32* %i, align 4
  br label %for.cond0
for.cond0:
  %1 = load i32, i32* %i, align 4
  %forcmp0 = icmp slt i32 %1, %op0
  br i1 %forcmp0, label %for.body0, label %for.end0
for.body0:
  %2 = load i32, i32* %i, align 4
  %j = alloca i32, align 4
  store i32 %0, i32* %j, align 4
  br label %for.cond1
for.cond1:
  %3 = load i32, i32* %j, align 4
  %forcmp1 = icmp slt i32 %3, 10
  br i1 %forcmp1, label %for.body1, label %for.end1
for.body1:
  %4 = load i32, i32* %j, align 4
  %5 = load i32, i32* %j, align 4
  %6 = load i32, i32* %i, align 4
  %ifcmp0 = icmp sgt i32 %5, %6
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %5)
  br label %if.end0
if.else0: 
  %7 = load i32, i32* %i, align 4
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %7)
  br label %if.end0
if.end0:
  br label %for.inc1
for.inc1:
  %8 = load i32, i32* %j, align 4
  %inc1 = add nsw i32 %8, 1
  store i32 %inc1, i32* %j, align 4
  br label %for.cond1
for.end1:
  br label %for.inc0
for.inc0:
  %9 = load i32, i32* %i, align 4
  %inc0 = add nsw i32 %9, 1
  store i32 %inc0, i32* %i, align 4
  br label %for.cond0
for.end0:
  ret i32 0
}
declare i32 @printf(i8*, ...)
