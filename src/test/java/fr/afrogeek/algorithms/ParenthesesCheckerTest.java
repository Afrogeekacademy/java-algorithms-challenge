package fr.afrogeek.algorithms;

import fr.afrogeek.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParenthesesCheckerTest {



        /**
         * Rigorous Test :-)
         */
        @Test
        public void testApp() {
            assertTrue(true);
        }

        @Test
        public void testBalancedParentheses() { // Texte le cas oú les parentheses balancent
            assertTrue(ParenthesesChecker.checkBalancedParentheses("()"));
            assertTrue(ParenthesesChecker.checkBalancedParentheses("(())"));
            assertTrue(ParenthesesChecker.checkBalancedParentheses("(()())"));
        }

        @Test
        public void testUnbalancedParentheses() { // Teste les cas oú le nombre les impair
            assertFalse(ParenthesesChecker.checkBalancedParentheses("("));
            assertFalse(ParenthesesChecker.checkBalancedParentheses(")"));
            assertFalse(ParenthesesChecker.checkBalancedParentheses("(()"));
            assertFalse(ParenthesesChecker.checkBalancedParentheses("())"));
        }

        @Test
        public void testEmptyString() { // teste le cas oú le string est vide
            assertTrue(ParenthesesChecker.checkBalancedParentheses(""));
        }

        @Test
        public void testStringWithoutParentheses() { // Teste le cas ou le string ne contient pas de parenthese
            assertTrue(ParenthesesChecker.checkBalancedParentheses("Hello  World Danke !"));
        }

    }
