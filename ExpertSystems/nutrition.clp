(deffunction precision (?num ?digits)
    (bind ?m (integer (** 10 ?digits)))
    (/ (integer (* ?num ?m)) ?m)
)

(defrule read-gender
    (initial-fact)
    =>
    (printout t crlf crlf "   Welcome! Diet & Nutrition Expert " crlf)
    (printout t "   ********************************" crlf)
    (printout t "   The output of this program is:" crlf)
    (printout t "   1. Your Body Mass Index (BMI) and body-status." crlf)
    (printout t "   2. Recommended daily calories needed based on your body-status." crlf)
    (printout t "   3. Daily protein needed based on your weight (kgs)." crlf)
    (printout t "   4. Daily calcium needed based on your age." crlf)
    (printout t "   5. Daily fibre needed based on calories needed." crlf)
    (printout t "   6. Daily carbohydrate needed based on your weight (kgs)." crlf)
    (printout t "What is your gender (Female/Male) *case-sensitive* :" crlf)
    (assert (gender (read)))
)

(defrule read-age
    (gender ?)
    =>
    (printout t "Please enter your age:")
    (assert (age (read)))
)

(defrule read-height
    (age ?)
    =>
    (printout t "Please enter your height (in CMs):")
    (assert (height (read)))
)

(defrule read-weight
    (height ?)
    =>
    (printout t "Please enter your weight (in KGs):")
    (assert (weight (read)))
)

(defrule read-activity-days
    (weight ?)
    =>
    (printout t "How many days do you exercise in a week?:" )
    (assert (activity-days (read)))
)

(defrule activity-sedentary
    (activity-days ?d)
    =>
    (if (< ?d 2)
    then
        (assert (activity-factor 1.2) (activity-rate sedentary))
    )
)

(defrule activity-moderate
    (activity-days ?d)
    =>
    (if (and (>= ?d 2) (< ?d 5))
    then
        (assert (activity-factor 1.55) (activity-rate moderate))
    )
)

(defrule activity-hard
    (activity-days ?d)
    =>
    (if (>= ?d 5)
    then
        (assert (activity-factor 1.75) (activity-rate hard))
    )
)

(defrule calculate-BMI
    (weight ?w)
    (height ?h)
    =>
    (bind ?bm (/ ?w (* (/ ?h 100) (/ ?h 100))))
    (printout t "BMI before rounding: " ?bm crlf)
    (assert (bmi (precision ?bm 2)))
)

(defrule status-underweight
    (bmi ?bm)
    =>
    (if (< ?bm 18.5)
    then
        (assert (body-status underweight))
    )
)

(defrule status-normal-weight
    (bmi ?bm)
    =>
    (if (>= ?bm 18.5)
        then
        (if (< ?bm 24.9)
            then
            (assert (body-status normal-weight))
        )
    )
)

(defrule status-overweight
    (bmi ?bm)
    =>
    (if (>= ?bm 24.9)
        then
        (if (< ?bm 29.9)
            then
            (assert (body-status overweight))
        )
    )
)

(defrule status-obesity
    (bmi ?bm)
    =>
    (if (>= ?bm 29.9)
        then
        (assert (body-status obesity))
    )
)

(defrule calculate-calories-needed-females
    (gender Female)
    (age ?a)
    (weight ?w)
    (height ?h)
    (activity-factor ?af)
    =>
    (assert (calories-needed (* (- (- (+ (* 10 ?w) (* 6.25 ?h)) (* 5 ?a)) 161) ?af)))
)

(defrule calculate-calories-needed-males
    (gender Male)
    (age ?a)
    (weight ?w)
    (height ?h)
    (activity-factor ?af)
    =>
    (assert (calories-needed (* (- (- (+ (* 10 ?w) (* 6.25 ?h)) (* 5 ?a)) 5) ?af)))
)

(defrule get-calcium-baby
    (age ?a)
    =>
    (if (< ?a 4)
    then
        (assert (calcium-needed 700))
    )
)

(defrule get-calcium-children
    (age ?a)
    =>
    (if (and (>= ?a 4) (< ?a 9))
    then
        (assert (calcium-needed 1000))
    )
)

(defrule get-calcium-teenager
    (age ?a)
    =>
    (if (and (>= ?a 9) (< ?a 19))
    then
        (assert (calcium-needed 1300))
    )
)

(defrule get-calcium-adult
    (age ?a)
    =>
    (if (>= ?a 19)
    then
        (if (< ?a 51)
            then
            (assert (calcium-needed 1000))
        )
    )
)

(defrule get-calcium-elderly
    (age ?a)
    =>
    (if (>= ?a 51)
    then
        (assert (calcium-needed 1200))
    )
)

(defrule get-protein-sedentary
    (activity-rate sedentary)
    (weight ?w)
    =>
    (assert (protein-needed (* 0.5 ?w)))
)

(defrule get-protein-moderate
    (activity-rate moderate)
    (weight ?w)
    =>
    (assert (protein-needed (* 0.7 ?w)))
)

(defrule get-protein-hard
    (activity-rate hard)
    (weight ?w)
    =>
    (assert (protein-needed (* 0.9 ?w)))
)

(defrule get-carbohydrate
    (weight ?w)
    =>
    (assert (carbohydrate-needed (* 4 ?w)))
)

(defrule get-fibre
    (calories-needed ?calo)
    =>
    (assert (fibre-needed (precision (/ ?calo 58.5) 2)))
)

(defrule protein-advice
    (protein-needed ?p)
    =>
    (printout t crlf crlf "    ########## RESULTS ##########" crlf)
    (printout t "    1. You need " ?p "g of proteins per day." crlf)
)

(defrule fibre-advice
    (fibre-needed ?f)
    =>
    (printout t "    2. You need " ?f "g of fibre per day." crlf)
)

(defrule carbohydrate-advice
    (carbohydrate-needed ?carb)
    =>
    (printout t "    3. You need " ?carb "g of carbohydrates per day." crlf)
)

(defrule calcium-advice
    (calcium-needed ?calc)
    =>
    (printout t "    4. You need " ?calc "g of calcium per day." crlf)
)

(defrule calories-advice-underweight
    (body-status underweight)
    (calories-needed ?calo)
    (bmi ?bm)
    =>
    (printout t "    5. Your Body Mass Index (BMI) is " ?bm " (" ?bm ")." crlf)
    (printout t "    6. You need " ?calo " calories per day to maintain a healthy weight." crlf)
    (printout t "    7. Expert Advice: You may need extra 300 daily calories (" ( + 300 ?calo ) ") to gain 0.25kg/week." crlf crlf)
)

(defrule calories-advice-normalweight
    (body-status normal-weight)
    (calories-needed ?calo)
    (bmi ?bm)
    =>
    (printout t "    5. Your Body Mass Index (BMI) is " ?bm " (" ?bm ")." crlf)
    (printout t "    6. You need " ?calo " calories per day to maintain a healthy weight." crlf crlf)
)

(defrule calories-advice-overweight
    (body-status overweight)
    (calories-needed ?calo)
    (bmi ?bm)
    =>
    (printout t "    5. Your Body Mass Index (BMI) is " ?bm " (" ?bm ")." crlf)
    (printout t "    6. You need " ?calo " calories per day to maintain a healthy weight." crlf)
    (printout t "    7. Expert Advice: You may need to reduce your daily calories by 300 to (" ( - ?calo 300 ) ") to lose 0.25kg/week." crlf crlf)
)

(defrule calories-advice-obesity
    (body-status obesity)
    (calories-needed ?calo)
    (bmi ?bm)
    =>
    (printout t "    5. Your Body Mass Index (BMI) is " ?bm " (" ?bm ")." crlf)
    (printout t "    6. You need " ?calo " calories per day to maintain a healthy weight." crlf)
    (printout t "    7. Expert Advice: You may need to reduce your daily calories by 500 to (" ( - ?calo 500 ) ") to lose 0.5kg/week." crlf crlf)
)
