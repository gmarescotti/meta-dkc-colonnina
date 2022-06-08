
SUMMARY = "Intel binary tool "
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/intelbinary/intelbinary-0.0.2.tar.gz"
SRC_URI[sha256sum] = "70256c4eb725730fe79f66caf3f88bb8464ad139744304fc30f3158e48991204"

S = "${WORKDIR}/intelbinary-0.0.2"

DEPENDS += " "
# RDEPENDS_${PN} += "python3-multidict python3-idna"

