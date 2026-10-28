package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test 
    void fire_Failure() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1, 1.0);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(false, result);
    }

    @Test 
    void torpedoCountDecreasesAfterFire() {
        // Arrange
        TorpedoStore store = new TorpedoStore(2);

        // Act
        store.fire(1);
        int remainingTorpedoes = store.getTorpedoCount();

        // Assert
        assertEquals(1, remainingTorpedoes);
    }

    
}
