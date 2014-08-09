(function (Kotlin) {
  'use strict';
  var _ = Kotlin.defineRootPackage(null, /** @lends _ */ {
    net: Kotlin.definePackage(null, /** @lends _.net */ {
      abesto: Kotlin.definePackage(null, /** @lends _.net.abesto */ {
        snakelike: Kotlin.definePackage(null, /** @lends _.net.abesto.snakelike */ {
          js: Kotlin.definePackage(null, /** @lends _.net.abesto.snakelike.js */ {
            kotlin: Kotlin.definePackage(null, /** @lends _.net.abesto.snakelike.js.kotlin */ {
              main$f: function () {
                $('#container').text('coolness' + (new _.net.abesto.snakelike.js.kotlin.Game(3)).getTick());
              },
              main: function (args) {
                $(_.net.abesto.snakelike.js.kotlin.main$f);
              },
              Game: Kotlin.createClass(null, function (tick) {
                this.tick_w5plfr$ = tick;
              }, /** @lends _.net.abesto.snakelike.js.kotlin.Game.prototype */ {
                getTick: function () {
                  return this.tick_w5plfr$;
                }
              })
            })
          })
        })
      })
    })
  });
  Kotlin.defineModule('kotlin-js-snakelike', _);
  _.net.abesto.snakelike.js.kotlin.main([]);
}(Kotlin));
