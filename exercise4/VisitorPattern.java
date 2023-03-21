package visitor;

interface message{
	public void accept(UserMessage msg);
}
interface UserMessage{
	public void visit(FamilyGrp family);
	public void visit(FriendsGrp frnds);
}
class FamilyGrp implements message{
	@Override
	public void accept(UserMessage msg) {
		msg.visit(this);
	}
}
class FriendsGrp implements message{
	@Override
	public void accept(UserMessage msg) {
		msg.visit(this);
	}
}
class MessageDisplay implements UserMessage{
	@Override
	public void visit(FamilyGrp family) {	
		System.out.println("Good morning to family group");
	}
	@Override
	public void visit(FriendsGrp frnds) {
		System.out.println("Good morning to friends group");
	}
}
class VisitorPattern{
	public static void main(String[] args) {
		message[] messages = new message[] {new FamilyGrp(), new FriendsGrp()};
		UserMessage m = new MessageDisplay();
		for(message message1 : messages) {
			message1.accept(m);
		}
	}
}
