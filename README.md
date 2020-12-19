# Java-pratice
자바를 공부하는 저장소입니다.

## 여담
* 원래는 파이썬을 공부하던 중이라 visual studio code IDE를 사용중이었지만 
자바개발환경은 eclipse나 intellij를 사용하는 것이 좋다고 해서 둘 다 사용해보았고,
eclipse의 UI가 마음에 안 들어서 intellij로 결정하였다.

***

## 12/17
* 구구단 구현 완료

### 파이썬과 자바 비교
* 확실히 파이썬의 코드가 자바의 코드보다 보기 쉽고 직관적인 부분이 많다.
* 파이썬은 배열을 선언만하고 사이즈를 점점 늘릴 수 있지만, 자바는 선언과 초기화를 하면 배열의 사이즈가 정해진다.

***

## 12/18
* 계산기 구현 완료
* 달력 구현중...

### 파이썬과 자바 비교
* 자바는 배열과 리스트가 나뉘어져 있지만 파이썬은 배열은 따로 없고 리스트로 관리한다.
* 자바는 Integer.parseInt()로 문자를 변환하고 파이썬은 int()로 변환 가능하다.

### 오늘 기억하고 싶은 것.
* Private : 해당 클래스 내에서만 사용 가능
* freindy(생략가능) : 같은 패키지 내에서만 가능
* Public : 같은 프로젝트 내에서 호출 가능
* Static : 해당 클래스의 객체를 생성하지 않고도 사용 가능하게 해줌.
* Final : 처음 초기화 이후 다시 초기화 하지 못하게 함, 자바스크립트의 const와 비슷(?)하다고 생각하자.

***

## 12/19
* 달력 구현완료(File i/o에 관한 내용은 나중에 다시 공부)

### 파이썬과 자바 비교
* 자바는 리스트를 사용할 때 객체를 선언(ex:List<String> list = new ArrayList<String>();)
  하고 사용가능하지만 파이썬은 바로 초기화 가능하다.
* 파이썬은 hashmap의 value에 값을 추가할 때, 변수[key값].append()로 간단하게 리스트 값을 추가 가능 
  하지만 자바는 list값을 따로 변수로 저장하고 추가하고 싶은 것을 list값에 추가한 후 다시 hashmap의 value에
  값을 넣는다.

### 오늘 기억하고 싶은 것.
* 자바 hashmap 안에 리스트 넣는 객체 선언 : 
  HashMap<String, ArrayList<String>> dic = new HashMap<String, ArrayList<String>>()

***