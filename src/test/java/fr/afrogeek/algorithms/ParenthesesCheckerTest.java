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
            assertTrue(App.checkBalancedParentheses("()"));
            assertTrue(App.checkBalancedParentheses("(())"));
            assertTrue(App.checkBalancedParentheses("(()())"));
        }

        @Test
        public void testUnbalancedParentheses() { // Teste les cas oú le nombre les impair
            assertFalse(App.checkBalancedParentheses("("));
            assertFalse(App.checkBalancedParentheses(")"));
            assertFalse(App.checkBalancedParentheses("(()"));
            assertFalse(App.checkBalancedParentheses("())"));
        }

        @Test
        public void testEmptyString() { // teste le cas oú le string est vide
            assertTrue(App.checkBalancedParentheses(""));
        }

        @Test
        public void testStringWithoutParentheses() { // Teste le cas ou le string ne contient pas de parenthese
            assertTrue(App.checkBalancedParentheses("Hello, World!"));
        }

    }
