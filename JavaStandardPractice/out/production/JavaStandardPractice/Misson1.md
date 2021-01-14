## 가상머신 설치(VirtualBox로 설치)
<img width="300" alt="가상머신 설치 실패" src="https://user-images.githubusercontent.com/64648893/103848483-d834bd80-50e5-11eb-9b3f-700dd9f253f8.png">

- 가상머신을 바로 깔았을 때 안되서 방법을 찾아봤더니 보안이 설정 되어 있었다.

<img width="300" alt="스크린샷 2021-01-07 오후 12 35 01" src="https://user-images.githubusercontent.com/64648893/103848394-a0c61100-50e5-11eb-8d43-cae2d92f31d1.png">

- 보안 따로 설정을 해주니 해결!


## 가상머신에 우분투 설치

1. ubuntu-20.10-desktop-amd64.iso 다운로드

2. virtualBox에 가상머신을 만들어준다.(디스크 크기 30기가 정도)
   
   <img width="300" alt="스크린샷 2021-01-07 오후 1 32 24" src="https://user-images.githubusercontent.com/64648893/103851470-37e29700-50ed-11eb-8c23-581417b21920.png">

3. 우분투 가상머신을 누르고 설정->저장소-> 컨트롤러IDE에 1번에서 다운로드 받은
파일을 넣어준다.

   <img width="300" alt="스크린샷 2021-01-07 오후 1 32 24" src="https://user-images.githubusercontent.com/64648893/103851778-de2e9c80-50ed-11eb-9f56-4381b1dcb359.png">

4. 네트워크에서 어댑터에 브리지로 변경하고 MAC주소를 여러 번 새로고침
   <img width="300" alt="스크린샷 2021-01-07 오후 1 42 10" src="https://user-images.githubusercontent.com/64648893/103851936-38c7f880-50ee-11eb-918d-db9f3d98f22c.png">

5. 가상 머신을 실행하고 우분투를 설치해준다.

## 가상 환경에 원격으로 접속할 수 있도록 ssh 설정
- 원격접속을 위해서 virtualBox 우분투의 설정->네트워크->NAT으로 
변경하고 고급->포트포워딩을 들어가서 설정해주었다.
  
    <img width="300" alt="스크린샷 2021-01-07 오후 3 52 40" src="https://user-images.githubusercontent.com/64648893/103861300-8d746f00-5100-11eb-9db2-c1af789e7255.png">

- 그런데 접속이 되지 않고 이런 메시지가 떠서 2시간동안 삽질했다.
  
    <img width="300" alt="스크린샷 2021-01-07 오후 3 57 06" src="https://user-images.githubusercontent.com/64648893/103861654-1c818700-5101-11eb-8391-4a4d7eca8d66.png">

- 그래도 삽질한 결과 우분투에서 ssh 서버를 오픈해주어야 한다는 것을 알았고, 확인해보니 ssh가 설치되어 있지 않아서 아래의 명령어를 사용해
설치하였다.(설치하니 열려있었다..)
> sudo apt-get install ssh

- 문제를 해결하고 ssh -p 포트번호 사용자이름@호스트아이디 를 입력하고 비밀번호 입력을 통해 가상환경 우분투에 원격으로
접속할 수 있었다.
  
- 계정에서 backup 디렉토리를 생성하고 764모드로 바꾸기
  
    <img width="300" alt="스크린샷 2021-01-07 오후 4 12 02" src="https://user-images.githubusercontent.com/64648893/103863352-0c1edb80-5104-11eb-8f3b-fe7ce8c09daa.png">

    <img width="300" alt="스크린샷 2021-01-07 오후 4 20 45" src="https://user-images.githubusercontent.com/64648893/103863505-556f2b00-5104-11eb-998a-1380a6fe6af2.png">





