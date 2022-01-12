
SUMMARY = "Intel binary tool "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/intelbinary/intelbinary-0.0.2.tar.gz"
SRC_URI[md5sum] = "0629a3cdf761c385e659e07b8e273f44"
SRC_URI[sha256sum] = "c3a66769aa6cdf8b3cb66d4a5040d7f9ab565bcf085feac554202f07593ee152"

S = "${WORKDIR}/intelbinary-0.0.2"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

