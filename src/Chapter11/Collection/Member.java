package Chapter11.Collection;

public class Member {

    private int memberID;
    private String memberName;

    public Member(){}
    public Member(int memberID, String memberName){
        this.memberID = memberID;
        this.memberName = memberName;
    }

    @Override
    public String toString() {
        return memberName + "회원이 아디이는 " + memberID + "입니다.";
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
