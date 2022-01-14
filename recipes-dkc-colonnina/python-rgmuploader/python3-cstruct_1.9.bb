
SUMMARY = "cstruct"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/cstruct/cstruct-1.9.tar.gz"
SRC_URI[md5sum] = "2b79b6c70ede46b5f38c32bd6b53e620"
SRC_URI[sha256sum] = "5bb74a2e9dbb6287a87a479abbdd8b72419c416dfa0bf2a704b1fb108bf00473"

S = "${WORKDIR}/cstruct-1.9"

DEPENDS += " "

