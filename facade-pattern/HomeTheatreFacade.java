public class HomeTheatreFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheatreFacade(Amplifier amp,
			Tuner tuner;
			DvdPlayer dvd,
			CdPlayer cd,
			Projector projector,
			Screen screen,
			TheaterLights lights,
			PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");

		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		amp.on();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
}
