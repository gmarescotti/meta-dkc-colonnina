
SUMMARY = "WebSocket client & server library, WAMP real-time framework"
HOMEPAGE = "http://crossbar.io/autobahn"
AUTHOR = "Crossbar.io Technologies GmbH <>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97c0bda20ad1d845c6369c0e47a1cd98"

SRC_URI = "https://files.pythonhosted.org/packages/4c/9e/f5bdfb55d1eab67c4b6d24d1397f95feec792071ff1b2f5a893d6d5247f3/autobahn-21.3.1.tar.gz"
SRC_URI[md5sum] = "dcba839ee61be33d05042a09c008c6bc"
SRC_URI[sha256sum] = "e126c1f583e872fb59e79d36977cfa1f2d0a8a79f90ae31f406faae7664b8e03"

S = "${WORKDIR}/autobahn-21.3.1"

RDEPENDS_${PN} = "python3-txaio python3-cryptography python3-hyperlink"

inherit setuptools3
