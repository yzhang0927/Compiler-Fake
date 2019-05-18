@.str = private unnamed_addr constant [4 x i8] c"%d\0A\00",align 1
@ss = global i32 0, align 4
@a = global i32 0, align 4
@s = global i32 0, align 4

define i32 @main() #0 {
entry:
  store i32 3, i32* @s, align 4
  store i32 110, i32* @ss, align 4
  store i32 12, i32* @a, align 4
  %0 = load i32, i32* @a, align 4
  %ifcmp0 = icmp sgt i32 %0, 10
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %0)
  br label %if.end0
if.else0: 
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 10)
  br label %if.end0
if.end0:
  %1 = load i32, i32* @a, align 4
  %ifcmp1 = icmp sgt i32 %1, 10
  br i1 %ifcmp1, label %if.then1, label %if.else1
if.then1: 
  %call2 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %1)
  br label %if.end1
if.else1: 
  br label %if.end1
if.end1:
  %2 = load i32, i32* @s, align 4
  %ifcmp2 = icmp sgt i32 %2, 5
  br i1 %ifcmp2, label %if.then2, label %if.else2
if.then2: 
  %3 = load i32, i32* @ss, align 4
  %ifcmp3 = icmp sgt i32 %3, 100
  br i1 %ifcmp3, label %if.then3, label %if.else3
if.then3: 
  %call3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 100)
  br label %if.end3
if.else3:
  %4 = load i32, i32* @ss, align 4
  %cmp4 = icmp slt i32 %4, 50
  br i1 %cmp4, label %if.then4, label %if.else4
if.then4: 
  %call4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 50)
  br label %if.end3
if.else4: 
  br label %if.end3
if.end3:
  br label %if.end2
if.else2:
  %5 = load i32, i32* @s, align 4
  %cmp5 = icmp slt i32 %5, 4
  br i1 %cmp5, label %if.then5, label %if.else5
if.then5: 
  %call5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 4)
  br label %if.end2
if.else5: 
  %call6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 3)
  br label %if.end2
if.end2:
  %6 = load i32, i32* @ss, align 4
  %call7 = call i32 @f(i32 %6)
  %call8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %call7)
  %7 = load i32, i32* @ss, align 4
  %call9 = call i32 @ff(i32 %7)
  %call10 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 %call9)
  ret i32 0
}
declare i32 @printf(i8*, ...)

define i32 @ff(i32 %t) {
entry:
  %t.addr = alloca i32, align 4
  store i32 %t, i32* %t.addr, align 4
  %b = alloca i32, align 4
  store i32 22, i32* %b, align 4
  store i32 44, i32* %t.addr, align 4
  %0 = load i32, i32* %t.addr, align 4
  %1 = load i32, i32* %b, align 4
  %op0 = add nsw i32 %0, %1
  ret i32 %op0
  ret i32 0
}

define i32 @f(i32 %t) {
entry:
  %t.addr = alloca i32, align 4
  store i32 %t, i32* %t.addr, align 4
  %b = alloca i32, align 4
  store i32 22, i32* %b, align 4
  %0 = load i32, i32* %b, align 4
  %ifcmp0 = icmp sgt i32 %0, 5
  br i1 %ifcmp0, label %if.then0, label %if.else0
if.then0: 
  %call0 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 42)
  br label %if.end0
if.else0: 
  %call1 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @.str, i64 0, i64 0), i32 24)
  br label %if.end0
if.end0:
  %1 = load i32, i32* %t.addr, align 4
  %2 = load i32, i32* %b, align 4
  %op0 = add nsw i32 %1, %2
  ret i32 %op0
  ret i32 0
}
