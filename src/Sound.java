public class Sound {

    /** the array of values in this sound; guaranteed not to be null */
    private int[] samples;

    /** constructor created for testing purposes
     * Not part of original problem
     */
    public Sound(int[] samples) {
        this.samples = samples;
    }

    /** Changes those values in this sound that have an amplitude greater than limit.
     * Values greater than limit are changed to limit.
     * Values less than -limit are chhanged to -limit.
     * @param limit the amplitude limit
     *              Precondition limit >= 0
     * @return the number of values in this sound that this method changed.
     */
    public int limitAmplitude(int limit) {
        int num =0;
        for(int i = 0; i<samples.length; i++){
            if(samples[i]< -limit){
                samples[i] = -limit;
                num++;
            }else if(samples[i]> limit){
                samples[i] = limit;
                num++;
            }
        }
        return num;

    }

    /**
     * Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0;
     * Precodition: samples contains at least one nonzero value
     * Postcondition: the length of samples reflects the removal of starting silence
     */
    public void trimSilenceFromBeginning() {
        int x =-1;
        for(int i=0; i< samples.length; i++){
            if(samples[i] == 0){
                x = i+1;
            }
            else{
                break;
            }
        }
        int[] arr;
        if(x != -1){
            arr = new int[samples.length - x];

        }else{
            return;
        }
        for(int z = 0; z<arr.length; z++){
            arr[z] = samples[z +x];


        }
        samples=arr;
       
    }

    /** accessor method used for testing purposes - Not part of original program */
    public int[] getSamples() {
        return samples;
    }
}
