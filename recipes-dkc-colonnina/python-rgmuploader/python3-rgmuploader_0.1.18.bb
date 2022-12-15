
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.18.tar.gz"
SRC_URI[sha256sum] = "45f2e9732841e850af33d3f4961691ed65757a7fe60fff0d55f5fd35ce37efd0"

S = "${WORKDIR}/rgmuploader-0.1.18"

RDEPENDS_${PN} += " python3-singleton-decorator"

