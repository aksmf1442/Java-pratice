package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args){
        MemberArrayList memberArraylist = new MemberArrayList();

        Member memberLee = new Member(101, "이순신");
        Member memberKim = new Member(102, "김유신");
        Member memberShin = new Member(103, "신사임당");

        memberArraylist.addMember(memberLee);
        memberArraylist.addMember(memberKim);
        memberArraylist.addMember(memberShin);

        memberArraylist.showAll();

        memberArraylist.removeMember(memberKim.getMemberId());
        memberArraylist.showAll();
    }
}
