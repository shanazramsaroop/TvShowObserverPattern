public class Main {

        public static void main(String[] args){

            TvShow theOffice = new TvShow("The Office");

            for (int i = 0; i < 50; i++) {
                new Person("Subscriber #" + i, theOffice);
            }

            theOffice.setLatestEpisode("Episode 2");

        }
}