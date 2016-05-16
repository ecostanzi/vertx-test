(function() {
  'use strict';

  angular
    .module('vertx')
    .run(runBlock);

  /** @ngInject */
  function runBlock($log) {

    $log.debug('runBlock end');
  }

})();
