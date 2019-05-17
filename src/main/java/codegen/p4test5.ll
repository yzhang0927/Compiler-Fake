@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@a = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 12, i32* @a, align 4
  %0 = load i32, i32* @a, align 4
  %cmp0 = icmp sgt i32 %0, 10
  br i1 %cmp0, label %if.then0, label %if.else0
if.then0: 
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %0)
  br label %if.end0
if.else0: 
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 10)
  br label %if.end0
if.end0:
  %1 = load i32, i32* @a, align 4
  %cmp1 = icmp sgt i32 %1, 10
  br i1 %cmp1, label %if.then1, label %if.else1
if.then1: 
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  br label %if.end1
if.else1: 
  br label %if.end1
if.end1:
  %2 = load i32, i32* @a, align 4
  %cmp2 = icmp slt i32 %2, 10
  br i1 %cmp2, label %if.then2, label %if.else2
if.then2: 
  %call3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 10)
  br label %if.end2
if.else2:
  %3 = load i32, i32* @a, align 4
  %cmp3 = icmp sgt i32 %3, 11
  br i1 %cmp3, label %if.then3, label %if.else3
if.then3: 
  %call4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 11)
  br label %if.end2
if.else3: 
  br label %if.end2
if.end2:
  ret i32 0
}
declare i32 @printf(i8*, ...)
