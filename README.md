# reporting-example [![Build Status][travis-svg]][travis-link] [![Dependencies Status][deps-svg]][deps-link]
[![Heroku][heroku-svg]][heroku-link]

> This is [me][jan] following along with the instructions of the 2nd part of chapter 7 of [Web Development with Clojure, 2nd Edition][webdevclo] by [Dmitri Sotnikov][dimtri].

## Prerequisites

You will need [Leiningen][lein] 2.0 or above installed. Plus, you need [PostgreSQL][postgresql].

## Development
First, initialize your development database running:

    lein run migrate

Then, to start a web server for the application, run:

    lein run

Finally, run tests with:

    lein test

And, of course, read the [book][webdevclo] :).

## Resources
 - [Forum for the Book by the Pragmatic Bookshelf][pragma-forum]
 - [Clojurians Slack Group][clojurians] (I'm [@jan][clojurians-jan] if you wanna say hey)
 - [Luminus - Clojure micro-framework for Web Development][luminus]
 - [eastwood - a Clojure lint tool][eastwood]
 - [kibit - There's a function for that][kibit]

## Other Chapters
 - Chapter 1-5, see https://github.com/janraasch/guestbook.
 - Chapter 6, see https://github.com/janraasch/catpics.
 - 1st part of chapter 7, see https://github.com/janraasch/clojure-db-examples.
 - 2nd part of chapter 7, see https://github.com/janraasch/employeezies.
 
## Contributing

Not sure why you would want to contribute here, but, if you would like to contribute, please do so :). In lieu of a formal styleguide, take care to maintain the existing coding style. Add unit tests for any new or changed functionality. Plus, make sure to adhere to these [commit message conventions][commit].

## License

Copyright © 2016 [Jan Raasch][jan]

[deps-link]: https://jarkeeper.com/janraasch/employeezies
[deps-svg]: https://jarkeeper.com/janraasch/employeezies/status.svg
[bikeshed]: https://github.com/dakrone/lein-bikeshed
[kibit]: https://github.com/jonase/kibit
[eastwood]: https://github.com/jonase/eastwood
[luminus]: http://www.luminusweb.net/
[heroku-link]: https://employeezies.herokuapp.com/
[heroku-svg]: http://img.shields.io/badge/employeezies-onHeroku-b58eb4.svg
[travis-link]: https://travis-ci.org/janraasch/employeezies
[travis-svg]: https://travis-ci.org/janraasch/employeezies.svg?branch=master
[clojurians-jan]: https://clojurians.slack.com/messages/clojure/team/jan/
[pragma-forum]: https://forums.pragprog.com/forums/387
[clojurians]: http://clojurians.net/
[commit]: https://docs.google.com/document/d/1QrDFcIiPjSLDn3EL15IJygNPiHORgU1_OOAqWjiDU5Y/edit?pref=2&pli=1#heading=h.uyo6cb12dt6w
[atom-clojure]: https://atom.io/packages/language-clojure
[parinfer]: https://atom.io/packages/parinfer
[proto-repl]: https://atom.io/packages/proto-repl
[atom]: https://atom.io
[lein]: https://github.com/technomancy/leiningen
[webdevclo]: https://pragprog.com/book/dswdcloj2/web-development-with-clojure-second-edition
[dimtri]: http://yogthos.net
[jan]: http://janraasch.com
[postgresql]: http://www.postgresql.org/
