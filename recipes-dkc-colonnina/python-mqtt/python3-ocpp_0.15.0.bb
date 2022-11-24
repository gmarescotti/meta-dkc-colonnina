
SUMMARY = "Python package implementing the JSON version of the Open Charge Point Protocol (OCPP)."
HOMEPAGE = "https://github.com/mobilityhouse/ocpp"
AUTHOR = "André Duarte <andre15x@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=357da596bd4bc9004894e2feaaa1e975"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/fe/65/2afe0f652e25939fc7b87f8db32d8eb7c324c6b8cc17b323e6e3e7aa31b7/ocpp-0.15.0.tar.gz"
SRC_URI[md5sum] = "dcce15a82fe6aa9f24f660d7050aa267"
SRC_URI[sha256sum] = "552df698e093fc6a400da211ed91aed99ae5dfb6361ec2a1f92b2a763f686985"

S = "${WORKDIR}/ocpp-0.15.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-jsonschema"

BBCLASSEXTEND = "native nativesdk"
