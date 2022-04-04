## Summary
You’ll be implementing a program that provides a pronunciation for any valid Hawaiian phrase the user enters. The program will need to check the validity of the phrases, and will need to follow all of the provided rules for how pronunciation works.

The Hawaiian language only contains 13 characters: eight consonants and five vowels. The eight consonants are h, k, l, m, n, p, w, and ' (a single apostrophe, called an okina). All Hawaiian words end in a vowel; the five vowels are a, e, i, o, and u.

When getting a phrase from the user, only these 13 characters (and the space character) are valid, and each word must end in a vowel. The pronunciation of consonants is pretty simple: h, k, l, m, n, and p are pronounced just like they are in English. The w is a bit trickier – if it’s at the start of a word, or follows an o or u, it’s pronounced as a “w”. But if it follows an a, e, or i, it’s pronounced as a “v” instead. (We’ll cover the okina in a bit.)

The pronunciation of vowels seems pretty simple at first, with each vowel having a specific pronunciation:

- a sounds like ah e.g., Austin ah-stin
- e sounds like eh e.g., egg eh-gg
- i sounds like ee e.g., bee
- o sounds like oh e.g., obey oh-bay
- u sounds like oo e.g., moo These rules alone let us pronounce a number of simple Hawaiian words:
- aloha sounds like ah-loh-hah
- ohana sounds like oh-hah-nah
- wahine sounds like wah-hee-neh If this was it for the pronunciation, we could simply check how to pronounce the “w”s, and then replace all the “a”s with “ah”s and all the “u”s with “oo”s and so on, and we would be done! But that can’t be all, since that would mean that “Hawaii” was pronounced “hah-vah-ee-ee”, that the island of “Maui” was pronounced “mah-oo-ee”, and that “lei” was pronounced “leh-ee”, none of which is right.

-Some pairs of vowels are pronounced differently from their two components:
- ai sounds like eye
- ae sounds like eye same as ai
- ao sounds like ow e.g., how
- au sounds like ow same as ao
- ei sounds like ay e.g., hay
- eu sounds like eh-oo
- iu sounds like ew e.g., dew
- oi sounds like oy e.g., boy
- ou sounds like ow same as ao
- ui sounds like ooey e.g., gooey

Following these rules, we can “fix” the incorrect pronunciations from earlier:

- Hawaii actually sounds like hah-veye-ee
- Maui actually sounds like mow-ee
- lei actually sounds like lay

You’ll notice that not every vowel combination is represented: for example, there is no “oa” combined vowel sound. This means that the island “Oahu” is pronounced “oh-ah-hoo” with the “o” and “a” being pronounced separately. There are also words with more than 2 vowels in a row, and these need to handled from left to right. For example, the word kaiaola has four vowels in a row; since “ai” and “ao” are both combined vowel sounds, it’s pronounced “keye-ow-lah”. The word “kaioke” has three vowels in a row, and is pronounced “keye-oh-keh”.

However, if there are more than 2 vowels in a row, and the first two vowels do not have a combined vowel sound, you pronounce the first vowel normally, and then check to see if the next two vowels have a combined sound. So the word “Huaai” would be pronounced “hoo-ah-eye” with the “u” and the first “a” being pronounced separately, since there is no “ua” or “aa” sounds (but there is an “ai” sound, hence the “eye” at the end).

## Expectations && Advice
* Spaces must be kept intact when pronouncing a phrase.
* You are NOT ALLOWED to use the .replace() method or any other methods we have not covered.
* Don’t worry about the exact placement of hyphens until everything else is working. (It’s generally easier to have more hyphens than needed, and remove the ones you don’t need.) The words are still readable if they have extra hyphens in them.
