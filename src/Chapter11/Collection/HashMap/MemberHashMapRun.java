package Chapter11.Collection.HashMap;


public class MemberHashMapRun {
    public static void main(String[] args) {

        MemberHashMap manager = new MemberHashMap();

        Member memberLee = new Member(300,  "Lee");
        Member memberKim = new Member(100, "Kim");
        Member memberPark = new Member(200, "Park");
        Member memberPark2 = new Member(400, "Park");

        manager.addMember(memberLee);
        manager.addMember(memberKim);
        manager.addMember(memberPark);
        manager.addMember(memberPark2);

        manager.showwAllMember();
        manager.removeMember(200);
        manager.showwAllMember();
    }
}
