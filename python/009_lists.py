"""Functions for tracking poker hands and assorted card tasks.
Python list documentation: https://docs.python.org/3/tutorial/datastructures.html
"""


def get_rounds(number):
    """Create a list containing the current and next two round numbers.

    Parameters:
        number (int): The current round number.

    Returns:
        list: The current round number and the two that follow.
    """

    return list(range(number, number + 3))


def concatenate_rounds(rounds_1, rounds_2):
    """Concatenate two lists of round numbers.

    Parameters:
        rounds_1 (list): The first rounds played.
        rounds_2 (list): The second group of rounds played.

    Returns:
        list:  All rounds played.
    """

    return rounds_1 + rounds_2


def list_contains_round(rounds, number):
    """Check if the list of rounds contains the specified number.

    Parameters:
        rounds (list): The rounds played.
        number (int): The round number.

    Returns:
        bool: Was the round played?
    """

    return number in rounds


def card_average(hand):
    """Calculate and returns the average card value from the list.

    Parameters:
        hand (list): The cards in the hand.

    Returns:
        float: The average value of the cards in the hand.
    """

    return sum(hand) / len(hand)


def approx_average_is_average(hand):
    """Return True if the first+last average or the median equals the actual average."""
    actual_avg = sum(hand) / len(hand)

    # Strategy 1: Average of the first and last card
    first_last_avg = (hand[0] + hand[-1]) / 2

    # Strategy 2: The median (middle card)
    median = hand[len(hand) // 2]

    # Check if either strategy matches the actual average
    return actual_avg == first_last_avg or actual_avg == median


def average_even_is_average_odd(hand):
    # Return True if the average of even-indexed cards equals the average of odd-indexed cards.
    # Slice the list for even indexes (0, 2, 4...) and odd indexes (1, 3, 5...)
    even_cards = hand[0::2]
    odd_cards = hand[1::2]

    # Calculate the averages
    even_avg = sum(even_cards) / len(even_cards)
    odd_avg = sum(odd_cards) / len(odd_cards)

    return even_avg == odd_avg


def maybe_double_last(hand):
    """If the last card in the hand is a Jack (11), double its value."""
    if hand[-1] == 11:
        hand[-1] = 22  # 11 * 2
    return hand
