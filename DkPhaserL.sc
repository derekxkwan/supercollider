DkPhaserL {
*ar {|in,freq = 1, range = 0.37, mid = 0.5, depth = 0.5, mul = 1|
	var in, del, delT;
	in = In.ar(inBus, 1);
	delT = SinOsc.kr(freq, 0, range, mid);
	del = AllpassL.ar(in, 3, delT, 0, depth);
	in = (in + del)/2;
	in = in*mul;
^in;
}
}
