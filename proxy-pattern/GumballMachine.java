import java.rmi.*;
import java.rmi.server.*;

public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	String location;

	State state = soldOutState;
	int count = 0;

	public GumballMachine(String location, int numberOfGumballs) throws RemoteException {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.location = location;

		this.count = numberOfGumballs;

		if(numberOfGumballs > 0) {
			state = noQuarterState;
		}
	}

	public String getLocation() {
		return location;
	}

	public void insertQuarter() {
		state.insertQuarter();
	}

	public void ejectQuarter() {
		state.ejectQuarter();
	}

	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public int getCount() {
		return this.count;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getState() {
		return state;
	}
}
