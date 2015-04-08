DkRandRepeat {
	*ar {|in, randFreq = 0.25, delLenMin = 0.02, delLenMax = 0.08, envLenMin = 0.5, envLenMax = 1.5, thresh = 0.5, dry=1, wet =1, doneAction = 0|
		var trig, fft, onset, del, env, sig;
			trig = Impulse.ar(randFreq);
	fft = FFT(LocalBuf(512), in);
	onset = Onsets.kr(fft, thresh);
	del = DelayN.ar(LocalIn.ar(1)+in, 0.2, TRand.kr(delLenMin, delLenMax, onset));

	env = EnvGen.ar(Env.linen(0.001, TRand.kr(envLenMin,envLenMax, onset), 0.01), onset, doneAction: doneAction);
	LocalOut.ar(del*env);
		sig = ((in*dry)+(del*wet))*env;
		^sig;





	}
}
