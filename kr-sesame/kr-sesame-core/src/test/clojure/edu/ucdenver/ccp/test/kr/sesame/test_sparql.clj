(ns edu.ucdenver.ccp.test.kr.sesame.test-sparql
  (use clojure.test
       [edu.ucdenver.ccp.test.kr.sesame.test-kb :exclude [test-ns-hook]])
  (require edu.ucdenver.ccp.test.kr.test-kb
           edu.ucdenver.ccp.test.kr.test-sparql))

;;; --------------------------------------------------------
;;; 
;;; --------------------------------------------------------

(defn test-ns-hook []
  (binding [edu.ucdenver.ccp.test.kr.test-kb/*kb-creator-fn*
            sesame-memory-test-kb]
    (run-tests 'edu.ucdenver.ccp.test.kr.test-sparql)))

;;; --------------------------------------------------------
;;; END
;;; --------------------------------------------------------
