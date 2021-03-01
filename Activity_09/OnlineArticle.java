/**
 * OnlineArticle class inherits the OnlineTextItem class
 * and has a word count.
 *
 * Activity_09
 *
 * @author Chase Tillman - COMP 1210 - 010
 * @version 11/3/2020
 */
public class OnlineArticle extends OnlineTextItem {
   private int wordCount;
   
   /**
    * Creates an instance of the OnlineArticle class.
    * @param nameIn - name of the article.
    * @param priceIn - Price of the article.
    */
   public OnlineArticle(String nameIn, double priceIn) {
      super(nameIn, priceIn);
      wordCount = 0; 
   }
   
   /** 
    * Sets the word count of the article. 
    * @param wordCountIn - The word count of the article.
    */
   public void setWordCount(int wordCountIn) {
      wordCount = wordCountIn;
   }
   
   
}