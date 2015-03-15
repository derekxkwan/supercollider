DkStretch1 {
	*ar {|in, rate =0.01, freqScale = 1, thresh = 0.5, maxLen = 5, mul = 1|
		var recBuf, onsetBuf, recPhase, playPhase, sig, bufLen, onset;
		bufLen = SampleRate.ir*maxLen;
		recBuf = LocalBuf(bufLen);
		onsetBuf = LocalBuf(1024, 1);
		onsetBuf = FFT(onsetBuf, in);
		onset = Onsets.kr(onsetBuf, thresh);
		recPhase = Phasor.ar(onset, 1, 0, bufLen, 0);
		BufWr.ar(in, recBuf, recPhase, 1);
		playPhase = Phasor.ar(onset, rate, 0, bufLen, 0);
		playPhase = playPhase/bufLen;
		sig = Warp1.ar(1, recBuf, playPhase, freqScale, 0.15, -1, 15, 0.85, 4, mul);
		^sig;






	}

}
