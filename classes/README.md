Custom Classes:

DkRepeat1 - triggers delayed repeats of signals by onsets.
    args: inSignal, delayLength(0.05), lengthOfRepeatInSec(1), onsetThreshold(0.5), dryLevel(1), wetLevel(1), doneAction(0)
    
DkRandRepeat - same but with randomized repeat frequencyies and lengths
    args: inSignal, frequencyOfRandomNumbers(0.25), minDelayLength(0.02), maxDelayLength(0.08), minLengthOfRepeat(0.5), maxLengthOfRepeat(1.5),
          onsetThreshold(0.5), dryLevel(1), wetLevel(1), doneAction(0)


DkStretch - time stretching triggered by onset detection.
    args: inSignal, playbackRate(0.01), frequencyScaling(1), ampThreshForOnsets(0.5), maxLengthToStretchInSeconds(5), mul(1)
    
DkStretchTrig - same except with external trigger
    args: inSignal, t_trig, playbackRate(0.01), frequencyScaling(1), maxLengthToStretchInSeconds(5), mul(1)
