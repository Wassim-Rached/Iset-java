import produit.Article;
import produit.ArticleLot;
import vente.Magasin;

public class TestMagasin {
    public static void main(String[] args) {
        // Create a new Magasin with a maximum of 10 articles
        Magasin magasin = new Magasin(10);

        // Create some articles
        Article article1 = new Article("A1", "Article 1", 10.0,0.21, "Famille 1");
        Article article2 = new Article("A2", "Article 2", 20.0,0.21, "Famille 2");
        ArticleLot articleLot1 = new ArticleLot("AL1", "Article Lot 1", 30.0,0.21, "Famille 3", 10, 0.3);
        // Add the articles to the magasin
        magasin.Ajout(article1);
        magasin.Ajout(article2);
        magasin.Ajout(articleLot1);

        // Display the inventory
        magasin.Inventaire();

        // Display the number of simple articles
        System.out.println("Number of simple articles: " + magasin.NbreArticlesSimples());

        // Display the list of article lots
        ArticleLot[] articleLots = magasin.ListeArticlesLot();
        for (ArticleLot articleLot : articleLots) {
            System.out.println(articleLot);
        }

        // Display the total TTC
        System.out.println("Total TTC: " + magasin.TotalTTC());

        // Display the articles from the same family as article1
        Article[] sameFamilyArticles = magasin.MemeFamille(article1);
        for (Article article : sameFamilyArticles) {
            System.out.println(article);
        }

        // Get an article by its code
        Article article = magasin.getArticle("A1");
        System.out.println(article);

        // Get the article lots with a number of pieces greater than articleLot1
        ArticleLot[] articleLotsSup = magasin.NbrePiecesSup(articleLot1);
        for (ArticleLot articleLot : articleLotsSup) {
            System.out.println(articleLot);
        }
    }
}