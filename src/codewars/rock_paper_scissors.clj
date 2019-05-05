(ns codewars.rock-paper-scissors)

(def wins #{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]})

(defn rps [p1 p2]
  (if (= p1 p2)
    "Draw"
    (if (= ((keyword p1) wins) p2)
      "Player 1 won!"
      "Player 2 won!")))

(#{["rock" "scissors"] ["scissors" "paper"] ["paper" "rock"]} ["rock" "scissors"])
