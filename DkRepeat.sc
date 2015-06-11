DkRepeat {
*ar {|in, delLenMax = 0.2, delLen = 0.05, envLen = 1, thresh = 0.5, dry=1, wet =1, doneAction = 0|
var fft, onset, del, env, sig;
fft = FFT(LocalBuf(512), in);
onset = Onsets.kr(fft, thresh);
del = DelayN.ar(LocalIn.ar(1)+in, delLenMax, delLen);
env = EnvGen.ar(Env.linen(0.001, envLen, 0.01), onset, doneAction: doneAction);
LocalOut.ar(del*env);
sig = ((in*dry)+(del*wet))*env;
^sig;
}
}
