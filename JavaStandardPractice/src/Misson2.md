# 일단 하나하나씩 해보고 쉘스크립트에 조금은 익숙해지면 밑에 적은 모든 것을
# 한큐에 해결할 예

## 디렉토리 만들기
- backup.sh를 만들고 for문을 통해 days1~16까지의 폴더를 만들었다.
  
    <img width="300" alt="스크린샷 2021-01-07 오후 10 10 28" src="https://user-images.githubusercontent.com/64648893/103896341-2cb35980-5135-11eb-9474-79499491f407.png">
    
    <img width="300" alt="스크린샷 2021-01-07 오후 10 10 18" src="https://user-images.githubusercontent.com/64648893/103896497-6a17e700-5135-11eb-8ea5-072125d0b88f.png">

   
## .cs 파일만 zip으로 압축해서 백업

1. 3~16days 폴더에 각각 .cs파일을 하나씩 for문으로 넣어준다.
    
    <img width="300" alt="스크린샷 2021-01-07 오후 10 21 44" src="https://user-images.githubusercontent.com/64648893/103897362-c7f8fe80-5136-11eb-9357-9f0d2836f6bf.png">

2. 실험을 위해 1~16days폴더에 txt파일을 for문으로 넣어준다.

    <img width="300" alt="스크린샷 2021-01-07 오후 10 27 11" src="https://user-images.githubusercontent.com/64648893/103897914-83219780-5137-11eb-9cb2-9e2b47e1348f.png">

3. 이중 for문을 돌리고 .cs의 확장자를 가진 파일의 이름을 .cs를 지우고 value변수에 저장한 후 
기존의 파일이름과 다르면 test.zip에 넣는 아이디어를 사용했다.

    <img width="300" alt="스크린샷 2021-01-07 오후 11 09 40" src="https://user-images.githubusercontent.com/64648893/103902339-bb2bd900-513d-11eb-9a41-5de8af3c847a.png">
    
    <img width="300" alt="스크린샷 2021-01-07 오후 11 08 58" src="https://user-images.githubusercontent.com/64648893/103902408-d5fe4d80-513d-11eb-8ae7-a10633e89df1.png">

4. 
