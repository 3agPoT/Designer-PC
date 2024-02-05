package practice.businessLogic;

/**
 * An interface for checking features and cost.
 */
public interface FeatureChecker {
     /**
      * Retrieves all features.
      * @return a string representing all features
      */
     String getAllFeatures();

     /**
      * Retrieves the cost.
      * @return the cost
      */
     int getCost();
}
