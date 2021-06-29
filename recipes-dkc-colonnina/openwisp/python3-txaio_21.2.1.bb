
SUMMARY = "Compatibility API between asyncio/Twisted/Trollius"
HOMEPAGE = "https://github.com/crossbario/txaio"
AUTHOR = "Crossbar.io Technologies GmbH <autobahnws@googlegroups.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=97c0bda20ad1d845c6369c0e47a1cd98"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/c5/39/2e715062283f8443d8ceeea32276db71741664d78d43c3edd3675498e926/txaio-21.2.1.tar.gz"
SRC_URI[md5sum] = "7e80b80ed7797245a5eef803043bdede"
SRC_URI[sha256sum] = "7d6f89745680233f1c4db9ddb748df5e88d2a7a37962be174c0fd04c8dba1dc8"

S = "${WORKDIR}/txaio-21.2.1"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
