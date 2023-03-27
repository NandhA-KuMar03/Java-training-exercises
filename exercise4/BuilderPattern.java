package builder;

class BuilderPattern{
	public static void main(String[] args) {
		Bike obj = new Bike.BuildBike().
				buildEngine(new Engine())
				.buildSeat(new Seat())
				.buildEngine(new Engine()).
				buildTire(new Tire()).
				build();
		System.out.println(obj);
	}
}
class Bike{
	Engine engine;
	Seat seat;
	Tank tank;
	Tire tire;
	public Bike(Engine engine, Seat seat, Tank tank, Tire tire) {
		this.engine = engine;
		this.seat = seat;
		this.tank = tank;
		this.tire = tire;
	}
	static class BuildBike {
		Engine engine;
		Seat seat;
		Tank tank;
		Tire tire;
		public BuildBike buildEngine(Engine engine) {
			this.engine = engine;
			return this;
		}
		public BuildBike buildSeat(Seat seat) {
			this.seat = seat;
			return this;
		}
		public BuildBike buildEngine(Tank tank) {
			this.tank = tank;
			return this;
		}
		public BuildBike buildTire(Tire tire) {
			this.tire = tire;
			return this;
		}
		public Bike build() {
			return new Bike(engine, seat , tank, tire);
		}
	}
	@Override
	public String toString() {
		return "Bike [engine "+ engine + "seat " + seat + " Tank " + tank + "Tire" + tire +"]" ;
	}
}
class Engine{
}
class Seat{
}
class Tank{
}
class Tire{
}